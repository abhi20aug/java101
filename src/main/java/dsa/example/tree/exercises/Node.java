package dsa.example.tree.exercises;

import lombok.AccessLevel;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor(access = AccessLevel.PROTECTED)
public class Node {
    private int data;
    private Node left;
    private Node right;
}
