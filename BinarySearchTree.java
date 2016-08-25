package binarySearchTree;

public class BinarySearchTree 
{

	BstNode root,p,temp;//root is the root node,while p variable will be used to handle all primary operations of tree and p will be assisted by temp variable if required;
	boolean isEmpty,isExisting,isDeleteRoot;//flags used to indicate whether the tree exists or not and also if the tree is empty or having values;
	
	void createTree()
	{
				isEmpty=true;
				isExisting=true;
				root=new BstNode();
	}//end of createTree() method
	
	void insert(int value)
	{
		
				if(isExisting)
				{
							if(isEmpty)
							{
									root.data=value;
									isEmpty=false;
									return;
							}//end of else stmt
							
							else
							{
									insert(root,value);
									return;
							}//end of else stmt
					
				}//end of if stmt
				
				else
				{
							System.out.println("The tree has yet not been created");
				}//end of else stmt
			
	}//end of insert(.) method
	
	void insert(BstNode x,int value)
	{
				if(value<x.data)
				{
						if(x.left!=null)
						{
									insert(x.left,value);
						}//end of if stmt
						if(x.left==null)
						{
									temp=new BstNode(value);
									x.left=temp;
									isEmpty=false;
									return;
						}//end of if stmt
				}//end of if stmt
				
				else
				{
						if(x.right!=null)
						{
									insert(x.right,value);
						}//end of if stmt
						if(x.right==null)
						{
									temp=new BstNode(value);
									x.right=temp;
									isEmpty=false;
									return;
						}//end of if stmt
					
				}//end of else stmt
				
	}//end of insert(..)method
	
	void delete(int value)
	{
				if(isExisting)
				{
						if(isEmpty)
						{
								System.out.println("Tree is already empty");
						}//end of if stmt
						
						else
						{
								delete(root,value);
						}//end of else stmt
				}//end of if stmt
				
				else
				{
						System.out.println("Tree doesnot exists yet!");
				}//end of else stmt
				
	}//end of delete(.) method
	
	/*
	 There are three conditions in delete method
	 (i)   If the node is leaf node
	 (ii)  If the node has only one child node
	 (iii) If the node has 2 child nodes
	 */
	
	
	
	
	void delete(BstNode x,int value)
	{
			p=x;
			isDeleteRoot=false;
			if(x==root)
			{
				
			}
						
	}//end of delete(..)method
	
	
	
	
	
	
	
}//end of class BinarySearchTree
