package parser;

import java.util.HashMap;
import java.util.Map;

public class EvalVisitor extends LabeledExprBaseVisitor<Object> {
    Map<String, Boolean> memoryConstants = new HashMap<String, Boolean>();
    Map<String, Object> memory = new HashMap<String, Object>();

    @Override public Object visitAssingString(LabeledExprParser.AssingStringContext ctx) {
        try{
            String id = ctx.ID().getText();

            if(memoryConstants.containsKey(id)) { throw new Exception("Variável constante não pode ter seu valor modificado!"); }
            if(!memory.containsKey(id)) { throw new Exception("Variavel não declarada!"); }

            Object value = null;

            if (ctx.stringexpr() != null){
                value = visit(ctx.stringexpr());
            }

            value = tryParse(value);

            memory.put(id, value);

            return value;
        }catch(Exception ex){
            System.err.println(ex.getMessage());
        }

        return null;
    }

    @Override
    public Boolean visitAssingNumber(LabeledExprParser.AssingNumberContext ctx) {
        try{
            String id = ctx.ID().getText();

            if(memoryConstants.containsKey(id)) { throw new Exception("Variável constante não pode ter seu valor modificado!"); }
            if(!memory.containsKey(id)) { throw new Exception("Variavel não declarada!"); }

            Object value = null;

            if(ctx.expr() != null){
                value = visit(ctx.expr());
            }

            value = tryParse(value);

            memory.put(id, value);

            return true;
        }catch(Exception ex){
            System.err.println(ex.getMessage());
        }

        return false;
    }

    @Override
    public Integer visitPrintln(LabeledExprParser.PrintlnContext ctx) {
        Object value = null;

        if (ctx.expr() != null){
            value = visit(ctx.expr());
        }
        /*else{
            value = visit(ctx.concatStringexpr());
        }*/

        System.out.println(value);

        return 0;
    }

    @Override public Integer visitPrintlnstr(LabeledExprParser.PrintlnstrContext ctx) {
        Object value = visit(ctx.concatStringexpr());

        System.out.println(value);

        return 0;
    }


    @Override
    public Integer visitInt(LabeledExprParser.IntContext ctx) {
        return Integer.valueOf(ctx.INT().getText());
    }

    @Override public Double visitFloat(LabeledExprParser.FloatContext ctx) {
        return Double.valueOf(ctx.getText());
    }

    @Override public String visitString(LabeledExprParser.StringContext ctx) {
        String str = ctx.getText();
        str = str.substring(1, str.length() - 1).replace("\"\"", "\"");
        return str;
    }

    @Override
    public Object visitId(LabeledExprParser.IdContext ctx) {
        try{
            String id = ctx.ID().getText();

            if(memory.containsKey(id)) return memory.get(id);

            throw new Exception("Variavel não declarada!");
        }catch(Exception ex){
            System.err.println("Variavel não declarada!");
        }

        return null;
    }

    @Override
    public Object visitMulDiv(LabeledExprParser.MulDivContext ctx) {
        Object left = visit(ctx.expr(0));

        Object right = visit(ctx.expr(1));

        //CASTING
        Integer castIntegerLeft = left instanceof Integer ? (Integer) left : null;
        Double castDoubleLeft = left instanceof Double ? (Double) left : null;

        Integer castIntegerRight = right instanceof Integer ? (Integer) right : null;
        Double castDoubleRight = right instanceof Double ? (Double) right : null;

        if(castIntegerLeft == null && castDoubleLeft == null ||
                (castIntegerRight == null && castDoubleRight == null)){
            System.err.println("Instância de variavel inválida!");
        }

        if(ctx.op.getType() == LabeledExprParser.MUL){
            if(castIntegerLeft != null){
                if(castIntegerRight != null){
                    return castIntegerLeft * castIntegerRight;
                }
                return castIntegerLeft * castDoubleRight;
            }
            if(castDoubleLeft != null){
                if(castDoubleRight != null){
                    return castDoubleLeft * castDoubleRight;
                }
                return castDoubleLeft * castIntegerRight;
            }
        }else{
            if(castIntegerLeft != null){
                if(castIntegerRight != null){
                    return castIntegerLeft / castIntegerRight;
                }
                return castIntegerLeft / castDoubleRight;
            }
            if(castDoubleLeft != null){
                if(castDoubleRight != null){
                    return castDoubleLeft / castDoubleRight;
                }
                return castDoubleLeft / castIntegerRight;
            }
        }

        return null;
    }

    @Override
    public Object visitAddSub(LabeledExprParser.AddSubContext ctx) {
        Object left = visit(ctx.expr(0));

        Object right = visit(ctx.expr(1));

        //CASTING
        Integer castIntegerLeft = left instanceof Integer ? (Integer) left : null;
        Double castDoubleLeft = left instanceof Double ? (Double) left : null;

        Integer castIntegerRight = right instanceof Integer ? (Integer) right : null;
        Double castDoubleRight = right instanceof Double ? (Double) right : null;

        if(castIntegerLeft == null && castDoubleLeft == null ||
                (castIntegerRight == null && castDoubleRight == null)){
            System.err.println("Instância de variavel inválida!");
        }

        if(ctx.op.getType() == LabeledExprParser.ADD){
            if(castIntegerLeft != null){
                if(castIntegerRight != null){
                    return castIntegerLeft + castIntegerRight;
                }
                return castIntegerLeft + castDoubleRight;
            }
            if(castDoubleLeft != null){
                if(castDoubleRight != null){
                    return castDoubleLeft + castDoubleRight;
                }
                return castDoubleLeft + castIntegerRight;
            }
        }else{
            if(castIntegerLeft != null){
                if(castIntegerRight != null){
                    return castIntegerLeft - castIntegerRight;
                }
                return castIntegerLeft - castDoubleRight;
            }
            if(castDoubleLeft != null){
                if(castDoubleRight != null){
                    return castDoubleLeft - castDoubleRight;
                }
                return castDoubleLeft - castIntegerRight;
            }
        }

        return null;
    }

    @Override public String visitConcatString(LabeledExprParser.ConcatStringContext ctx) {
        StringBuilder builder = new StringBuilder();

        try{
            // First Symbol
            if (ctx.op1.getType() == LabeledExprParser.ID){
                if(!memory.containsKey(ctx.op1.getText())){
                    throw new Exception("Variável não declarada!");
                }
                Object resultTyped = memory.get(ctx.op1.getText());
                builder.append(resultTyped == null ? "" : resultTyped.toString().replace("\"",""));
            }else{
                builder.append(ctx.op1.getText().replace("\"",""));
            }

            // Subsequent Symbols
            for (int sumStringIndex = 0; sumStringIndex < ctx.sumStringExpr().size(); sumStringIndex++){
                builder.append(visit(ctx.sumStringExpr(sumStringIndex)));
            }
        }catch (Exception ex){
            System.err.println(ex.getMessage());
        }

        return builder.toString();
    }

    @Override public String visitSumString(LabeledExprParser.SumStringContext ctx) {
        try{
            if (ctx.op2.getType() == LabeledExprParser.ID){
                if(!memory.containsKey(ctx.op2.getText())){
                    throw new Exception("Variável não declarada!");
                }

                Object resultTyped = memory.get(ctx.op2.getText());
                return resultTyped == null ? "" : resultTyped.toString();
            }
            return ctx.op2.getText().replace("\"","");
        }catch (Exception ex){
            System.err.println(ex.getMessage());
        }
        return "";
    }

    @Override
    public Object visitParens(LabeledExprParser.ParensContext ctx) {
        return visit(ctx.expr());
    }

    @Override public Integer visitDeclarationExpr(LabeledExprParser.DeclarationExprContext ctx){
        try{
            String[] types = new String[]{ "int", "float", "string" };

            String declarationText =  ctx.getText();

            // Removendo ; do final e dando split por virgula
            declarationText = declarationText.replace(";","");
            String[] variaveis = declarationText.split(",");

            for (int varIndex = 0; varIndex < variaveis.length; varIndex++){
                String variavel = variaveis[varIndex];
                String identificador = "";
                // Removendo tipo(s) da variavel e pegando somente o identificador
                for (int typeIndex = 0; typeIndex < types.length; typeIndex++){
                    String tipoAtual = types[typeIndex];
                    int posicaoTipo = variavel.indexOf(tipoAtual);
                    if(posicaoTipo >= 0){
                        identificador = variavel.replace(tipoAtual,"");
                        break;
                    }
                }

                identificador = identificador.trim();

                if(memory.containsKey(identificador)) { throw new Exception("Variavel já declarada!"); }

                memory.put(identificador, null);
            }
        }catch(Exception ex){
            System.err.println("Variavel já declarada!");
        }

        return 0;
    }

    @Override
    public Integer visitDeclarationSimpleExpr(LabeledExprParser.DeclarationSimpleExprContext ctx){
        try{
            String[] types = new String[]{ "int", "float", "string" };

            String declarationText =  ctx.getText();

            // Removendo ; do final e dando split por virgula
            declarationText = declarationText.replace(";","");
            String[] variaveis = declarationText.split(",");

            for (int varIndex = 0; varIndex < variaveis.length; varIndex++){
                String variavel = variaveis[varIndex];
                String identificador = "";
                // Removendo tipo(s) da variavel e pegando somente o identificador
                for (int typeIndex = 0; typeIndex < types.length; typeIndex++){
                    String tipoAtual = types[typeIndex];
                    int posicaoTipo = variavel.indexOf(tipoAtual);
                    if(posicaoTipo >= 0){
                        identificador = variavel.replace(tipoAtual,"");
                        break;
                    }
                }

                if(identificador.isEmpty()){
                    identificador = variavel;
                }

                identificador = identificador.trim();

                if(memory.containsKey(identificador)) { throw new Exception("Variavel já declarada!"); }

                memory.put(identificador, null);
            }
        }catch(Exception ex){
            System.err.println("Variavel já declarada!");
        }

        return 0;
    }

    //  CONST TYPES ID EQ (expr | stringexpr) # declarationConstExpr
    @Override public Boolean visitDeclarationConstExpr(LabeledExprParser.DeclarationConstExprContext ctx){
        String id = ctx.ID().getText();

        try{
            if(memory.containsKey(id)) { throw new Exception("Variavel já declarada!"); }

            Object value = null;

            if (ctx.stringexpr() != null){
                value = visit(ctx.stringexpr());
            }else{
                value = visit(ctx.expr());
            }

            value = tryParse(value);

            memory.put(id, value);
            memoryConstants.put(id, true);

            return true;
        }catch (Exception ex){
            System.err.println(ex.getMessage());
        }

        return false;
    }

    @Override
    public Integer visitConditionalExpr(LabeledExprParser.ConditionalExprContext ctx) {
        int result = (Integer) visit(ctx.comparisson());

        if (result == 1){
            visit(ctx.expr(0));
        }else{
            visit(ctx.expr(1));
        }

        return 0;
    }

    @Override public Integer visitWhileLoopExpr(LabeledExprParser.WhileLoopExprContext ctx) {
        int result = (Integer) visit(ctx.comparisson());

        while (result == 1){
            visit(ctx.expr());
            for (int i = 0; i < ctx.stat().size(); i++) {
                visit(ctx.stat(i));
            }
            result = (Integer) visit(ctx.comparisson());
        }

        return 0;
    }

    @Override public Object visitForLoopExpr(LabeledExprParser.ForLoopExprContext ctx) {
        Boolean result = (Boolean) visit(ctx.asignNumberExpr());

        try{
            if(!result){
                throw new Exception("Erro de declaração de variavel no for!");
            }
            String textAssign = ctx.asignNumberExpr().getText();
            String variable_name = textAssign.split("=")[0];

            Object value = memory.get(variable_name);
            value = tryParse(value);
            if (value instanceof String){
                throw new Exception("Não é possivel iterar sobre uma variavel string!");
            }

            Integer condition = (Integer) visit(ctx.comparisson());
            while(condition == 1){
                for (int i = 0; i < ctx.stat().size(); i++) {
                    visit(ctx.stat(i));
                }

                if (value instanceof Integer){
                    Integer value_converted = (Integer) value;
                    memory.put(variable_name, ++value_converted);
                    value = value_converted;
                }else if(value instanceof Double){
                    Double value_converted = (Double) value;
                    memory.put(variable_name, ++value_converted);
                    value = value_converted;
                }

                condition = (Integer) visit(ctx.comparisson());
            }
        }catch (Exception ex){
            System.err.println(ex.getMessage());
        }

        return 0;
    }


    @Override
    public Integer visitComparissonExpr(LabeledExprParser.ComparissonExprContext ctx) {
        Object element1;
        Object element2;

        if (ctx.op1.getType() == LabeledExprParser.INT){
            element1 = Integer.valueOf(ctx.op1.getText());
        }else if(ctx.op1.getType() == LabeledExprParser.FLOAT){
            element1 = Double.valueOf(ctx.op1.getText());
        }else{
            element1 = memory.get(ctx.op1.getText());
        }

        if (ctx.op2.getType() == LabeledExprParser.INT){
            element2 = Integer.valueOf(ctx.op2.getText());
        }else if(ctx.op2.getType() == LabeledExprParser.FLOAT){
            element2 = Double.valueOf(ctx.op2.getText());
        }else{
            element2 = memory.get(ctx.op2.getText());
        }

        String comparador = ctx.OPREL().getText();

        if (comparador.equals("<")){
            if(element1 instanceof Integer){
                if(element2 instanceof Integer){
                    return (Integer) element1 < (Integer)  element2 ? 1 : 0;
                }
                return (Integer) element1 < (Double)  element2 ? 1 : 0;
            }
        }else if(comparador.equals(">")){
            if(element1 instanceof Integer){
                if(element2 instanceof Integer){
                    return (Integer) element1 > (Integer)  element2 ? 1 : 0;
                }
                return (Integer) element1 > (Double)  element2 ? 1 : 0;
            }
        }else if(comparador.equals("==")){
            if(element1 instanceof Integer){
                if(element2 instanceof Integer){
                    return ((Integer) element1).equals((Integer) element2) ? 1 : 0;
                }
                return 0;
            }
        }else{
            if(element1 instanceof Integer){
                if(element2 instanceof Integer){
                    return !((Integer) element1).equals((Integer) element2) ? 1 : 0;
                }
                return 1;
            }
        }

        return null;
    }

    // TRYPARSES
    public static Object tryParse(Object value){
        if(value == null){
            return null;
        }

        Integer convertedInt = tryParseInt(value.toString());

        if(convertedInt != null){
            return convertedInt;
        }

        Double convertedDouble = tryParseDouble(value.toString());

        if(convertedDouble != null){
            return convertedDouble;
        }

        return value;
    }

    private static Integer tryParseInt(String value) {
        try {
            return Integer.parseInt(value);
        } catch (NumberFormatException e) {
            return null;
        }
    }

    private static Double tryParseDouble(String value) {
        try {
            return Double.parseDouble(value);
        } catch (NumberFormatException e) {
            return null;
        }
    }

}