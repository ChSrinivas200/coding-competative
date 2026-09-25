class Solution {
    public String reverseWords(String s) {
        ArrayList<String> temp=new ArrayList<>();
        String[] parts=s.split(" ");
        String res="";
        for(String part:parts){
            if(part.length()>0){
            temp.add(part);
            }
        }
        StringBuilder out=new StringBuilder();
        for(int i=temp.size()-1;i>=0;i--){
            out.append(temp.get(i));
            if(i>0){
            out.append(" ");
            }
        }
        return out.toString();
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna