public class ImplementTrie {



    class Trie{
        class TrieNode{
            public char val;
            public boolean isWord;
            public TrieNode[] children;

            public TrieNode(char val) {
                this.val = val;
                this.isWord=false;
                this.children=new TrieNode[26];
            }
        }

        public TrieNode root;

        public Trie() {
            root=new TrieNode('\u0000');
        }

        public void insert(String word) {
            if(search(word))
                return;
            TrieNode curr=root;
            for (int i = 0; i < word.length(); i++) {
                char c=word.charAt(i);
                if(curr.children[c-'a']==null)
                    curr.children[c-'a']=new TrieNode(c);
                curr=curr.children[c-'a'];
            }
            curr.isWord=true;
        }

        public boolean search(String word) {
            TrieNode curr=root;
            for (int i = 0; i < word.length(); i++) {
                char c=word.charAt(i);
                if(curr.children[c-'a']==null)
                    return false;
                curr=curr.children[c-'a'];
            }
            return curr.isWord;
        }

        public boolean startsWith(String prefix) {
            TrieNode curr=root;
            for(int i=0; i<prefix.length(); i++) {
                char c=prefix.charAt(i);
                if(curr.children[c-'a']==null)
                    return false;
                curr=curr.children[c-'a'];
            }
            return true;
        }
    }
}
