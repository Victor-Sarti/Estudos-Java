package arvores;

public class Arvore {
No root = null;

public void insert(int info, No place) {
	if(place == null) {
		root = new No(info);
		System.out.println(" " + info);
	}else if(info < place.info) {
		if(place.left == null) {
			place.left = new No(info);
			System.out.println(" " + info);
		}else {
			insert(info,place.left);
		}
	}else if(info > place.info) {
		if(place.right == null) {
			place.right = new No(info);
			System.out.println(" " +info);
		}else {
			insert(info, place.right);
		}
	}
}
}
