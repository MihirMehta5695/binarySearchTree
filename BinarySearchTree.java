package binarySearchTree;

public class BinarySearchTree 
{

	BstNode root,p,temp;//root is the root node,while p variable will be used to handle all primary operations of tree and p will be assisted by temp variable if required;
	boolean isEmpty,isExisting;//flags used to indicate whether the tree exists or not and also if the tree is empty or having values;
	
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
			while(true)
			{
					
					if(x.data==value)//value to be deleted is found
					{
								if(x==root)//if the node to be deleted is the root node then it has to handled in a special way
								{
									
								}//end of if stmt
								
								if((x.left==null)&&(x.right==null))//if the node is the leaf node
								{
											if(x.data>p.data)//to check if the node is right child of the parent node
											{
													p.right=null;
													x=null;
													return;
											}//end of if stmt
											
											else
											{
													p.left=null;
													x=null;
													return;											
											}//end of else stmt
												
								}//end of if stmt
								
								if(x.left==null)//if the node has no left subtree
								{
											if(x.data>p.data)//if x is right child of p
											{
													p.right=x.right;
													x=null;
													return;
											}//end of if stmt
											
											else//if x is left child of p
											{	
													p.left=x.right;
													x=null;
													return;
											}//end of else stmt
											
								}//end of if stmt
								
								if(x.right==null)//if the node has no right subtree //similar to above case :)
								{
											if(x.data>p.data)//if x is right child of p
											{
													p.right=x.left;
													x=null;
													return;
											}//end of if stmt
											
											else//if x is left child of p
											{	
													p.left=x.left;
													x=null;
													return;
											}//end of else stmt
								}//end of if stmt
								
								
					}//end of if stmt
					
					
					if(value<x.data)//if value is less than the data of current node traverse to left node
					{
								p=x;
								x=x.left;
								continue;
					}//end of if stmt
					
					if(value>x.data)//if value is greater than the data of the current node than traverse to the right node
					{
								p=x;
								x=x.right;
								continue;
					}//end of if stmt
					
					else//if the value is not found anywhere in the tree
					{
						System.out.println("No node with given value exists, Thus cannot perform delete operation");
					}//end of else stmt
					
					
					
					
			}//end of while loop
	}//end of delete(..)method
	
	
	
	
	
	
	
}//end of class BinarySearchTree
