import java.util.*;

public class Node {
    int freq;
    Node pre;
    Node next;
    Set<String> keys = new HashSet<>();
    
    Node(int x) {
        this.freq = x;
    }
}

class AllOne {
    Node head;
    Node tail;
    Map<String, Node> mp = new HashMap<>();

    public AllOne() {
        head = new Node(0);  // Dummy node with frequency 0
        tail = new Node(0);  // Dummy node with frequency 0
        head.next = tail;
        tail.pre = head;
    }

    public void inc(String key) {
        if (mp.containsKey(key)) {
            // Increment frequency of existing key
            Node node = mp.get(key);
            int frequency = node.freq;
            node.keys.remove(key);  // Remove key from current node
            
            Node nextNode = node.next;
            if (nextNode == tail || nextNode.freq != frequency + 1) {
                // Create a new node with frequency +1
                Node newNode = new Node(frequency + 1);
                newNode.keys.add(key);
                newNode.pre = node;
                newNode.next = nextNode;
                node.next = newNode;
                nextNode.pre = newNode;
                mp.put(key, newNode);
            } else {
                // Move key to the next node (frequency +1)
                nextNode.keys.add(key);
                mp.put(key, nextNode);
            }

            if (node.keys.isEmpty()) {
                removeNode(node);  // Remove current node if it's empty
            }
        } else {
            // Key not found, create with frequency 1
            Node firstNode = head.next;
            if (firstNode == tail || firstNode.freq > 1) {
                // Create a new node with frequency 1
                Node newNode = new Node(1);
                newNode.keys.add(key);
                newNode.pre = head;
                newNode.next = firstNode;
                head.next = newNode;
                firstNode.pre = newNode;
                mp.put(key, newNode);
            } else {
                // Add key to the first node (frequency 1)
                firstNode.keys.add(key);
                mp.put(key, firstNode);
            }
        }
    }

    public void dec(String key) {
        if (!mp.containsKey(key)) {
            return;  // Key does not exist
        }

        Node node = mp.get(key);
        node.keys.remove(key);  // Remove key from current node
        int frequency = node.freq;

        if (frequency == 1) {
            // If frequency is 1, remove the key from map
            mp.remove(key);
        } else {
            Node preNode = node.pre;
            if (preNode == head || preNode.freq != frequency - 1) {
                // Create a new node with frequency -1
                Node newNode = new Node(frequency - 1);
                newNode.keys.add(key);
                newNode.pre = preNode;
                newNode.next = node;
                preNode.next = newNode;
                node.pre = newNode;
                mp.put(key, newNode);
            } else {
                // Move key to the previous node (frequency -1)
                preNode.keys.add(key);
                mp.put(key, preNode);
            }
        }

        if (node.keys.isEmpty()) {
            removeNode(node);  // Remove current node if it's empty
        }
    }

    public String getMaxKey() {
        if (tail.pre == head) {
            return "";  // No elements
        } else {
            return tail.pre.keys.iterator().next();  // Get any key from the highest frequency node
        }
    }

    public String getMinKey() {
        if (head.next == tail) {
            return "";  // No elements
        } else {
            return head.next.keys.iterator().next();  // Get any key from the lowest frequency node
        }
    }

    private void removeNode(Node node) {
        Node preNode = node.pre;
        Node nextNode = node.next;
        preNode.next = nextNode;
        nextNode.pre = preNode;
    }
}


/**
 * Your AllOne object will be instantiated and called as such:
 * AllOne obj = new AllOne();
 * obj.inc(key);
 * obj.dec(key);
 * String param_3 = obj.getMaxKey();
 * String param_4 = obj.getMinKey();
 */