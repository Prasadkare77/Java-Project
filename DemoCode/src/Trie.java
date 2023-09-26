public class Trie {
    static class Node{
        Node[] children;
        boolean eow;

        public Node(){
            children = new Node[26];
            for (int i=0; i<26; i++){
                children[i] = null;
            }
            eow = false;
        }
    }

    static Node root = new Node();

    public static void insert(String word){
        Node curr = root;
        for (int i=0; i<word.length(); i++){
            int idx = word.charAt(i) - 'a';

            if (curr.children[idx] == null){
                curr.children[idx] = new Node();
            }
            if(i == word.length() - 1){
                curr.children[idx].eow = true;
            }

            curr = curr.children[idx];
        }
    }

    public static boolean search(String key){
        Node curr = root;
        for (int i=0; i<key.length(); i++){
             int idx = key.charAt(i) - 'a';
             Node node = curr.children[idx];

             if (node==null){
                 return false;
             }

             if (i == key.length()-1 && node.eow == false){
                 return false;
             }
            curr = curr.children[idx];
        }
        return true;
    }

    public static boolean wordBreak(String key){
        if (key.length()==0){
            return true;
        }

        for (int i=1; i<key.length(); i++){
            String firstPart = key.substring(0,i);
            String secondPart = key.substring(i);
            if (search(firstPart) && wordBreak(secondPart)){
                return true;
            }
        }
        return false;
    }

    public static boolean startWith(String prefix){
        Node curr = root;

        for (int i=0; i<prefix.length(); i++){
            int idx = prefix.charAt(i) - 'a';

            if (curr.children[idx]==null){
                return false;
            }
            curr = curr.children[idx];
        }
        return true;
    }

    public static int countNode(Node root){
        if (root == null){
            return 0;
        }
        int count = 0;
        for (int i=0; i<26; i++){
            if (root.children[i] != null){
                count += countNode(root.children[i]);
            }
        }
        return count+1;
    }

    public static String ans = " ";

    public static void longestWord(Node root, StringBuilder temp){
        if (root == null){
            return;
        }

        for (int i=0; i<26; i++){
            if (root.children[i] != null && root.children[i].eow == true){
                temp.append((char)(i+'a'));
                if (temp.length() > ans.length()){
                    ans = temp.toString();
                }
                longestWord(root.children[i], temp);
                temp.deleteCharAt(temp.length()-1);
            }
        }
    }
    public static void main(String arg[]){
        //String words[] = {"the","a","there","their","any"};

//        for (int i=0; i<words.length; i++){
//            insert(words[i]);
//        }
//
//        System.out.println(search("their"));
//        System.out.println(search("thor"));
//        System.out.println(search("an"));

//        String words[] = {"i","like","sam","samsung","mobile"};
//        String key = "ilikesamsung";
//
//        for (int i=0; i<words.length; i++){
//            insert(words[i]);
//        }
//        System.out.println(wordBreak(key));

//        String words[] = {"apple","app","mango","man","woman"};
//        String prefix = "app";
//
//        for (int i=0; i<words.length; i++){
//            insert(words[i]);
//        }
//        System.out.println(startWith(prefix));

//        String str = "ababa";
//        for (int i=0; i<str.length(); i++){
//            String suffix = str.substring(i);
//            insert(suffix);
//        }
//        System.out.println(countNode(root));

        String words[] = {"a","banana","app","appl","ap","apply","apple"};
        for (int i=0; i<words.length; i++){
            insert(words[i]);
        }
        longestWord(root,new StringBuilder(" "));
        System.out.println(ans);
    }
}
