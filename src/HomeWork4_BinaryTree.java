public class HomeWork4_BinaryTree<V extends Comparable<V>>  {

    private Node root;

    class Node{
        private V data;
        private Node left;
        private Node right;
        private String color;
        public Node (V date){
            this.data = date;
            color = "RED";
        }

        public String getColor() {
            return color;
        }

        public void setColor(String color) {
            this.color = color;
        }

        public V getData() {
            return data;
        }

        public int compareTo(V date){
            return this.data.compareTo(date);
        }
    }

    public boolean findNode(V data){
        Node node = root;
        while(node != null){
            if(node.data.equals(data)){
                return true;
            }
            if(node.data.compareTo(data) > 0){
                node = node.left;
            }
            else {
                node = node.right;
            }
        }
        return false;
    }

    public void insert(V data) {
        root = insert(root, data);
        root.setColor("BLACK");
    }

    private Node insert(Node x, V data){
        Node node;
        if(x == null) {
            return new Node(data);
        }
        else{
            node = x;
        }
        int cmp = x.compareTo(data);
        if(cmp > 0){
            node.left = insert(node.left, data);
        }
        else if(cmp < 0){
            node.right = insert(node.right, data);
        }
        else{
            node.data = data;
        }
        node = fixUp(node);

        return  node;

    }
    private Node fixUp(Node h){
        if(isRed(h.right) && !isRed(h.left)){
            h = leftTurn(h);
        }
        if(isRed(h.left) && isRed(h.left.left)){
            h = rightTurn(h);
        }
        if(isRed(h.right) && isRed(h.left)){
            swapColor(h);
        }
        return h;
    }

    private Node leftTurn(Node h){
        Node x = h.right;
        h.right = x.left;
        x.left = h;
        x.setColor(h.getColor());
        h.setColor("RED");
        return x;
    }
    private Node rightTurn(Node h){
        Node x = h.left;
        h.left = x.right;
        x.right = h;
        x.setColor(h.getColor());
        h.setColor("RED");
        return x;
    }
    private void swapColor(Node h){
        h.left.setColor("BLACK");
        h.right.setColor("BLACK");
        h.setColor("RED");
    }


    private Boolean isRed(Node x){
        if(x == null){
            return false;
        }
        return (x.color.equals("RED"));
    }




}
