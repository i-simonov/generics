package service.stack;

import java.util.NoSuchElementException;

public class CustomStack<T> {

    Node topNode;

    @Override
    public String toString() {

        StringBuilder description = new StringBuilder();

        description.append("[");

        Node node = topNode;
        while (node != null) {

            description.append(node.getValue().toString());
            node = node.getPrevious();

            if (node != null) {
                description.append(",");
            }
        }

        description.append("]");

        return description.toString();

    }

    public void add(T value) {

        Node newNode = new Node();

        newNode.setValue(value);
        newNode.setPrevious(topNode);

        topNode = newNode;

    }

    public void del(T value) {

        Node node = topNode;
        Node nextNode = null;
        Boolean isDeleted = false;

        while (node != null) {

            if (node.getValue().equals(value)) {

                isDeleted = true;
                if (node == topNode) {
                    topNode = node.getPrevious();
                } else {
                    nextNode.setPrevious(node.getPrevious());
                }

            }
            nextNode = node;
            node = node.getPrevious();

        }

        if (!isDeleted) {
            throw new NoSuchElementException("Value not found");
        }


    }

    public Integer size() {

        Integer i = 0;

        Node node = topNode;
        while (node != null) {
            ++i;
            node = node.getPrevious();
        }

        return i;
    }

    public Node find(T value) {

        Node node = topNode;

        while (node != null) {
            if (node.getValue().equals(value)) {
                return node;
            }
            node = node.getPrevious();
        }

        throw new NoSuchElementException("Value not found");

    }

    private class Node {
        T value;

        private Node previous;

        public void setPrevious(Node previous) {
            this.previous = previous;
        }

        public Node getPrevious() {
            return previous;
        }

        public T getValue() {
            return value;
        }

        public void setValue(T value) {
            this.value = value;
        }
    }
}