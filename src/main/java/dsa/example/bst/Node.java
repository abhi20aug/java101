package dsa.example.bst;

import lombok.AccessLevel;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor(access = AccessLevel.PACKAGE)
public class Node {
    private int data;
    private Node left;
    private Node right;
}
