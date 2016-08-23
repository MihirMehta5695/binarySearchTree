package binarySearchTree;

public class BstNode 
{
	
	int data;//data to be stored
	BstNode left,right;//to store the left and right childs of the node
	
	BstNode()//explicit no-arg ctor just to be used when a new tree is created
	{
		
		data=-1;
		left=right=null;
		
	}//end of BstNode() ctor
	
	BstNode(int data)//explicit argument ctor to be used when a new node is created after the tree has been created
	{
		
		this.data=data;
		left=right=null;
		
	}//end of BstNode(.) ctor
	
}//end of BstNode Class
