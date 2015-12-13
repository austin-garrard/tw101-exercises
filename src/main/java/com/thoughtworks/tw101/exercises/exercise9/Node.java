package com.thoughtworks.tw101.exercises.exercise9;

import java.util.ArrayList;
import java.util.List;


/**
 * An unbalanced binary tree that stores strings.
 *
 * @author Austin Garrard
 * @version 1.0
 */
public class Node {
    private String name;
    private Node parent;
    private Node left;
    private Node right;

    /**
     * Constructs a root node.
     *
     * @param name The name of the node
     */
    public Node(String name) {
        this.name = name;
        this.parent = null;
        this.left = null;
        this.right = null;
    }

    /**
     * Constructs a child node.
     *
     * @param name   The name of the node
     * @param parent Reference to the parent node
     */
    public Node(String name, Node parent) {
        this.name = name;
        this.parent = parent;
        this.left = null;
        this.right = null;
    }

    /**
     * Adds a new node to the tree rooted by this node.
     *
     * It will be added such that an in-order traversal of the tree
     * yields the nodes in ascending order, according to their names.
     *
     * @param nameOfNewNode The name of the new node
     */
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

    /**
     * In-order traversal of the tree rooted at this node.
     *
     * @return The names(in alphabetical order) of each node in the tree rooted by this node
     */
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
