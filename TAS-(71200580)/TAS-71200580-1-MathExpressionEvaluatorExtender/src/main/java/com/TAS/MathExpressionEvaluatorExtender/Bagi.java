package com.TAS.MathExpressionEvaluatorExtender;

public class Bagi extends OperatorNode {
        public Bagi(Node kiri, Node kanan) {
            super(kiri, kanan);
        }

        @Override
        public double hitung() {
            double hasil = 0;
            if(this.getKanan().hitung() > 0){
                hasil = this.getKiri().hitung() / this.getKanan().hitung();
            }
            return hasil;
        }
    }


