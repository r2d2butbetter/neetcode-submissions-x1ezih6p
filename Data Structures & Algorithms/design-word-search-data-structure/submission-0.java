class Node {

    Node[] links = new Node[26];

    boolean terminal = false;

    public boolean containsKey(char key) {
        return links[key - 'a'] != null;
    }

    public void put(char ch, Node node) {
        links[ch - 'a'] = node;
    }

    public Node get(char ch) {
        return links[ch - 'a'];
    }

    public void setEnd() {
        terminal = true;
    }

    public boolean isEnd() {
        return terminal;
    }
}

class WordDictionary {

    private Node root;

    public WordDictionary() {
        root = new Node();
    }

    public void addWord(String word) {
        Node node = root;

        for (char ch : word.toCharArray()) {
            if (!node.containsKey(ch)) {
                node.put(ch, new Node());
            }
            node = node.get(ch);
        }

        node.setEnd();
    }

public boolean search(String word) {
        return searchHelper(word, 0, root);
    }

    private boolean searchHelper(String word, int index, Node node) {
        if (index == word.length()) {
            return node.isEnd();
        }

        char ch = word.charAt(index);

        if (ch == '.') {
            for (int i = 0; i < 26; i++) {
                if (node.links[i] != null && searchHelper(word, index + 1, node.links[i])) {
                    return true;
                }
            }
            return false;
        } else {
            if (!node.containsKey(ch)) {
                return false;
            }
            return searchHelper(word, index + 1, node.get(ch));
        }
    }
}