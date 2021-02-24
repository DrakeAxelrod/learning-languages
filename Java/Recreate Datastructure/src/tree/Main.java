package tree;

import java.awt.*;
import java.sql.SQLOutput;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main
{
    class TreeNode
    {
        public int data;
        public TreeNode right;
        public TreeNode left;
        public TreeNode parent;

        public TreeNode(int data)
        {
            this.data = data;
            this.right = null;
            this.left = null;
            this.parent = null;
        }
    }

    public static void main(String[] args) throws InterruptedException {


    }

}
