package binarySearchTree;

public class BinarySearchTree 
{

	BstNode deltemp,root,p,temp;//root is the root node,while p variable will be used to handle all primary operations of tree and p will be assisted by temp variable if required;
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
								p=root;
								delete(root,value);
						}//end of else stmt
				}//end of if stmt
				
				else
				{
						System.out.println("Tree does not exists yet!");
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
			
			if(x.data==value)//node to be deleted is found
			{
				
					if(x.left==null&&x.right==null)//if the node to be deleted has no child,then we simply delete the node and set the respective child ptr of the parent node to null
					{
						
							if(x==root)//if x is pointing to root node itself , then it is special case and we delete the root node and set the isEmpty Flag
							{
									root=null;
									isEmpty=true;
									
							}//end of if stmt
							
							else//if the node to be deleted is other than root node 
							{
								
								
									if(p.data>x.data)//if the current node is having lesser value than its parent than set parent's left child ptr null;
									{
										p.left=null;
									}//end of if stmt
									
									if(p.data<x.data)//if the current node is having greater value than its parent tham set parent's right child ptr null;
									{
										p.right=null;
									}//end of if stmt
									x=null;//deleting the node pointed by x
									
									
							}//end of else stmt
												
					}//end of if stmt
					
					if(x.left==null&&x.right!=null)//if only right child is existing
					{
							//Start
						getmin(x.right,x);//getting the smallest node in the right subtree
						x.data=temp.data;//getting the temp value into current node and deleting the temp node from tree
						temp=null;
							
					}//end of if stmt
					
					
					if(x.right==null&&x.left!=null)//if only left child is existing
					{
							//start 
						getmax(x.left,x);//getting the biggest node from the left subtree 
						x.data=temp.data;//getting the temp value into current node and deleting the temp node from the tree
						temp=null;
							
						
						
					}//end of if stmt
					
					if(x.right!=null&&x.left!=null)//if both the child exists
					{
							//start
						getmin(x.right,x);//getting the smallest node in the right subtree
						x.data=temp.data;//getting the temp value into current node and deleting the temp node from tree
						temp=null;
						
					}//end of if stmt
					
					
					
			}//end of if stmt
			
			if(x.data<value)//if value is greater than current node move to right child
			{
				if(x.right!=null)//checking whether the right child exists or not
				{
					p=x;
					delete(x.right,value);
				}//end of if stmt
				
				else
				{
					System.out.println("No such value exists!");
					return;
				}//end of else stmt
					
			}//end of if stmt
			
			if(x.data>value)//if value is lesser than current node move to left child
			{
				if(x.left!=null)//checking whether the left child exists or not
				{
					p=x;
					delete(x.left,value);
				}//end of if stmt
				
				else
				{
					System.out.println("No such value exists!");
					return;
				}//end of else stmt
					
			}//end of if stmt
						
	}//end of delete(..)method
	
	
	void getmin(BstNode z,BstNode tz)
	{
	
		BstNode v=tz;
		while(z.left!=null)//traverse to the least valued node 
		{
			tz=z;
			z=z.left; 
		}//end of while loop
		if(tz==v)
		{
			temp=z;
			tz.right=null;
			return;
		}//end of if stmt
		temp=z;//storing the value of z in global variable temp
		tz.left=null;//delete the left child ptr of parent
		
		
		
	}//end of getmin(.) method
	
	
	void getmax(BstNode z,BstNode tz)
	{
		
		BstNode v=tz;
		while(z.right!=null)//traverse to the least valued node 
		{
			tz=z;
			z=z.right; 
		}//end of while loop
		
		if(tz==v)
		{
			temp=z;
			tz.left=null;
			return;
		}//end of if stmt
		
		temp=z;//storing the value of z in global variable temp
		tz.right=null;//delete the left child ptr of parent
		z=null;		//deleting from the lead node
		
	}//end of getmax(.) method
	
	void preOrder(BstNode x)
	{
		if(x==null)
		{
			return;
		}//end of if stmt
		
		
		System.out.println(x.data);
		preOrder(x.left);
		preOrder(x.right);
		
	}//end of preOrder method(.)
	
	void inOrder(BstNode x)
	{
		if(x==null)
		{
			return;
		}//end of if stmt
		
		
		inOrder(x.left);
		System.out.println(x.data);
		inOrder(x.right);
		
		
	}//end of postOrder method(.)
	
	void postOrder(BstNode x)

	{
		if(x==null)
		{
			return;
		}//end of if stmt
		
		postOrder(x.left);
		postOrder(x.right);
		System.out.println(x.data);
		
		
	}//end of preorder method(.)
	
	void display(int value)
	{
		if(value==4)
		{
			preOrder(root);
		}
		
		if(value==5)
		{
			inOrder(root);
			
		}
		
		if(value==6)
		{
			postOrder(root);
		}
	}

	
	void countAll()
	{
		if(isExisting&&!isEmpty)
		{
			System.out.println(count(root));
		}
		else
		{
			System.out.println("Tree is Empty!");
		}
	}
	
	
	int count(BstNode x)
	{
		int c=0;
		if(x==null)
		{
			return c;
		}
		c=c+count(x.left);
		c=c+count(x.right);
		return c+1;
		
	}
	
	void emptyTree()
	{
		root.left=null;
		root.right=null;
		root=null;
		isEmpty=true;
		isExisting=false;
		
	}
}//end of class BinarySearchTree
