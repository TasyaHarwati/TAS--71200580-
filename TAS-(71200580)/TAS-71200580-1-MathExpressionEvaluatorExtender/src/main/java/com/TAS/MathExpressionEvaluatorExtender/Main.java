package com.TAS.MathExpressionEvaluatorExtender;

public class Main {
    public static void main(String[] args) {
        //25 * 4^2
        OperandNode o1 = new OperandNode(25);
        OperandNode o2 = new OperandNode(4);
        UnaryOperator op1 = new Kuadrat(o2); // 4^2
        OperatorNode op2 = new Kali(o1,op1);
        System.out.println(op2.hitung());

        //5 + 3 * 4^2
        OperandNode o3 = new OperandNode(5);
        OperandNode o4 = new OperandNode(3);
        OperatorNode op3 = new Kali(o4,op1);
        OperatorNode op4 = new Tambah(o3,op3);
        System.out.println(op4.hitung());
    }
}

