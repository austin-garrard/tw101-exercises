package com.thoughtworks.tw101.exercises.exercise9;

import java.util.ArrayList;
import java.util.List;


/**
 * An unbalanced binary tree that stores strings.
 */
public class Node {
    private String name;
    private Node parent;
    private Node left;
    private Node right;

    public Node(String name) {
        this.name = name;
        this.parent = null;
        this.left = null;
        this.right = null;
    }

    public Node(String name, Node parent) {
        this.name = name;
        this.parent = parent;
        this.left = null;
        this.right = null;
    }

    public void add(String nameOfNewNode) {
        if (nameOfNewNode.compareTo(this.name) < 0) {
            //add to the left
            if (this.left == null) {
                this.left = new Node(nameOfNewNode, this);
            } else {
                this.left.add(nameOfNewNode);
            }
        } else {
            //add to the right
            if (this.right == null) {
                this.right = new Node(nameOfNewNode, this);
            } else {
                this.right.add(nameOfNewNode);
            }
        }
    }

    public List<String> names() {
        List<String> names = new ArrayList<String>();

        if (this.left != null) {
            names.addAll(this.left.names());
        }

        names.add(this.name);

        if (this.right != null) {
            names.addAll(this.right.names());
        }

        return names;
    }
}
