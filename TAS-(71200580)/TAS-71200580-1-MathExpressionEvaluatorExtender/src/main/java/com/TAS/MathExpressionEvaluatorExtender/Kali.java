package com.TAS.MathExpressionEvaluatorExtender;

public class Kali OperatorNode {
    public Kali(Node kiri, Node kanan) {
        super(kiri, kanan);
    }

    @Override
    public double hitung() {
        return this.getKiri().hitung() * this.getKanan().hitung();
    }

}
