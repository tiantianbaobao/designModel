package com.study.suanfa.tree;

import org.springframework.util.CollectionUtils;

import java.util.*;

/**
 * @author cuit_mercy@163.com
 * @version V1.0.0
 * @ClassName PreOrderTraveralWithStack
 * @description <p>二叉树的前序遍历，根节点，左孩子，右孩子</p>
 * @date 2020/3/17 16:51
 * @since V1.0.0
 **/
public class PreOrderTraveralWithStack {
    public static void main(String[] args) {
        LinkedList<Integer> input = new LinkedList<Integer>(Arrays.asList(new Integer[]{1,2,3,4,5,6,7,8,9}));
        TreeNode node = buildTree(input);
//        System.out.println("利用栈实现前序遍历：");
//        preTraverseTreeNode(node);
        //System.out.println("利用栈实现中序遍历：");
        //inOrderTraverseTreeNode(node);
        //inOrderTraverse(node);
//        postOrderTravers(node);
//        preTravers(node);
        levelOrderTravers(node);
        int q = 76861870;
        List<Object> list = new ArrayList<>();
        List<String> stringList = new ArrayList<>();
        list.add("");
        stringList.add((String) new Object());
    }

    /**
     * 构建树
     * @param input
     * @return
     */
    public static TreeNode buildTree(LinkedList<Integer> input) {
        if (CollectionUtils.isEmpty(input)) {
            return null;
        }
        TreeNode treeNode = null;
        Integer data = input.removeFirst();
        if (data != null) {
            treeNode = new TreeNode(data);
            treeNode.leftChild = buildTree(input);
            treeNode.rightChild = buildTree(input);
        }
        return treeNode;
    }

    public static void preTravers(TreeNode node) {
        if (node == null) {
            return;
        }
        System.out.println(node.data);
        preTravers(node.leftChild);
        preTravers(node.rightChild);
    }
    /**
     * 利用栈实现树的前序遍历
     * @param root
     */
    public static void preTraverseTreeNode(TreeNode root){
        Stack<TreeNode> stack = new Stack<>();
        TreeNode node = root;
        while(node!=null || !stack.empty()) {
            while(node != null) {
                System.out.println(node.data);
                stack.push(node);
                node = node.leftChild;
            }
            if (!stack.isEmpty()) {
                node = stack.pop();
                node = node.rightChild;
            }

        }

    }

    /**
     * 广度遍历
     * @param treeNode
     */
    public static void levelOrderTravers(TreeNode treeNode) {
        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(treeNode);
        while (!queue.isEmpty()){
            TreeNode node = queue.poll();
            System.out.println(node.data);
            if (node.leftChild!=null) {
                queue.offer(node.leftChild);
            }
            if (node.rightChild!=null) {
                queue.offer(node.rightChild);
            }
        }
    }

    /**
     * 中序遍历 左节点，根节点，右节点
     * <p>
     *     1、从根节点出发，一直深度遍历左子节点，直到某个左子节点为空
     *     2、输出当前节点
     *     3、输出当前节点的父节点
     *     4、输出当前节点的右节点
     * </p>
     * @param treeNode
     */
    public static void inOrderTraverseTreeNode(TreeNode treeNode) {
        Stack<TreeNode> stack = new Stack<>();
        TreeNode node = treeNode;
        while(node != null || !stack.empty()) {
            while(node!=null) {
                if(node.leftChild == null){
                    System.out.println(node.data);
                    break;
                }else {
                    stack.push(node);
                    node = node.leftChild;
                }
            }
            if (!stack.empty()) {
                node = stack.pop();
                System.out.println(node.data);
                node = node.rightChild;
            }
        }
    }

    public static void inOrderTraverse(TreeNode treeNode) {
        if (treeNode == null) {
            return;
        }
        inOrderTraverse(treeNode.leftChild);
        System.out.println(treeNode.data);
        inOrderTraverse(treeNode.rightChild);
    }

    public static void postOrderTravers(TreeNode treeNode) {
        if (treeNode == null) {
            return;
        }
        postOrderTravers(treeNode.leftChild);
        postOrderTravers(treeNode.rightChild);
        System.out.println(treeNode.data);
    }
    /**
     * 定义树的结点
     */
    public static class TreeNode{
        private Integer data;
        private TreeNode leftChild;
        private TreeNode rightChild;
        public TreeNode(Integer data) {
            this.data = data;
        }
    }
}
