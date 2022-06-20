package com.TAS.MathExpressionEvaluatorExtender;

public abstract class UnaryOperator extends Node{
    private Node dataNode;

    public Node getDataNode() {
        return dataNode;
    }

    public UnaryOperator(Node dataNode) {
        this.dataNode = dataNode;
    }

    @Override
    public abstract double hitung();
}

