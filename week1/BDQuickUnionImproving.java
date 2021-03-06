package week1;

public class BDQuickUnionImproving {
	public int[] id;
	private int[] sz;
	public BDQuickUnionImproving(int N){
		 id=new int[N];
		sz=new int[N];
		for(int i=0;i<N;i++){
			id[i]=i;
			sz[i]=1;
		}
	}
	
	public int root(int a){
		
		while(a!=id[a]){
		//id[a]=id[id[a]]; //make the tree almost complete flat
		a=id[a];
		}
		return a;
	}
	
	public Boolean connected(int a, int b){
		return root(a)==root(b);
	}
	
	public void union(int a, int b){
		if(connected(a,b)){}
			//System.out.println(a+" & "+b+" is already connected");
		else{
			if(sz[root(a)]>=sz[root(b)]){
				id[root(b)]=root(a);
				sz[root(a)]+=sz[root(b)];
			}
			else {
				id[root(a)]=root(b);
				sz[root(b)]+=sz[root(a)];
			}
		}
	}
	
	public static void main(String[]args){
		
	}
	
}
