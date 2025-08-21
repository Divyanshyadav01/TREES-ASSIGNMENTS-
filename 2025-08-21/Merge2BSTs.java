class Solution{
    public List<Integer> getAllElements(TreeNode root1,TreeNode root2){
        List<Integer> l1=new ArrayList<>(),l2=new ArrayList<>();
        inorder(root1,l1);inorder(root2,l2);
        return merge(l1,l2);
    }
    private void inorder(TreeNode root,List<Integer> l){
        if(root==null)return;
        inorder(root.left,l);l.add(root.val);inorder(root.right,l);
    }
    private List<Integer> merge(List<Integer> a,List<Integer> b){
        List<Integer> res=new ArrayList<>();
        int i=0,j=0;
        while(i<a.size()&&j<b.size()){
            if(a.get(i)<b.get(j))res.add(a.get(i++));
            else res.add(b.get(j++));
        }
        while(i<a.size())res.add(a.get(i++));
        while(j<b.size())res.add(b.get(j++));
        return res;
    }
}
