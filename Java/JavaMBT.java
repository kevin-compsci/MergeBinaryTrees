/*
Kevin Nguyen
Basic Java program to merge binary trees in place.

How to run (linux):
	1.) open command line and cd into directory folder of where this code is
	2.) type in "javac *.java" to compile java files
	3.) type in "java JavaMBT"
*/

//imports
import java.io.*;
import java.util.*;

//class
class JavaMBT {

	//main driver
	public static void main(String[] args) {
		//local Declarations
		
		//create trees

		//call merge

		//display results
	}
	
    //MergeTrees will take 2 trees as inputs and merge them; outputs a new tree 
    public TreeNode mergeTrees(TreeNode t1, TreeNode t2) {
        //both are empty
        if(t1 == null && t2 == null) {
            return t1;
        }
        
        //Base cases: if one branch is null while the other isn't then just return the non-null branch
        if(t1 == null && t2 != null) {
            return t2;
        }
        else if(t1 != null && t2 == null) {
            return t1;
        }
        else {
            //Recursive Case: perform recursion as long as there is a branch that's not null
            //make a new tree with the addition values from T1 and T2 respectively
            TreeNode newT = new TreeNode(t1.val+t2.val);
            
            //check if any left branches available; avoids unnecessary recursive calls
            if(t1.left != null || t2.left != null) {
                newT.left = mergeTrees(t1.left, t2.left);
            }
            //check if any right branches available; avoids unnecessary recursive calls 
            if(t1.right != null || t2.right != null) {
                newT.right = mergeTrees(t1.right, t2.right);
            }
            
            return newT;
        }
    }
}