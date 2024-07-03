package pp;

public class BinarySearchTree {
	  private BinaryNode root;
	  private class BinaryNode {
	     private int element;
	     private BinaryNode left;
	     private BinaryNode right;
	     BinaryNode(int element,BinaryNode left,BinaryNode right) {
	          this.element=element;
	          this.left=left;
	          this.right=right;
	      }
	  }
	  public BinarySearchTree( ) {
	     root=null;
	  }
	  public void clear( ) {
	     root=null;
	  }

	  public boolean isEmpty( ) {
	     return (root==null);
	  }
public void insert(int x) {
	root=insert(x,root);
}
private BinaryNode insert( int x, BinaryNode t ) {
      if ( t == null )
         t = new BinaryNode( x, null, null );
      else if( x < t.element )
         t.left = insert( x, t.left );
      else if( x > t.element ) 
         t.right = insert( x, t.right ); 
      return t;
}

				//ORDEM
    
	  /*public void print( ) {
		     if( isEmpty( ))
		        System.out.println( "Arvore Vazia" );
		     else
		        print( root );
	  } 

	  private void print( BinaryNode t ) {
		  
		  if ( t != null ) {
			  print( t.left );
		      System.out.println( t.element );
		      print( t.right );
		  }
	  }*/

					//PRÉ-ORDEM

		public void print() {
			if(isEmpty()) {
				System.out.println("Árvore Vazia");
			} else {
				print(root);
			}
		}
		
		private void print( BinaryNode t ) {
		  
		  if ( t != null ) {
      System.out.println( t.element );
       print( t.left );
		      print( t.right );
		  }
	  }

				/*//PÓS-ORDEM

		public void print() {
			if(isEmpty()) {
				System.out.println("Árvore Vazia");
			} else {
				print(root);
			}
		}
		
		private void print(BinaryNode t) {
			if( t != null) {
				print(t.left);
				print(t.right);
				System.out.println(t.element); 
					
			}
		}*/
}