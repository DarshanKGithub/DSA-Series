class TreeNode{
     constructor(val){
        this.val = val;
        this.left = null;
        this.right = null;
     }

}

//Preorder Traversel
function preOrder(root, result = []){
      if(root === null) return;

    result.push(root.val);
    preOrder(root.left, result);
    preOrder(root.right, result);

    return result;
}


//Inorder Traversal
function inOrder(root, result = []){
    if(root === null) return;

    inOrder(root.left, result);
    result.push(root.val);
    inOrder(root.right, result);

    return result;
}


//Postorder Traversal
function postOrder(root, result = []){
    if(root === null) return result;

    postOrder(root.left, result);
    postOrder(root.right, result);
    result.push(root.val);

    return result;
}

//Height of a tree
function height(root){
    if(root === null) return 0;

    return 1 + Math.max(height(root.left) ,height(root.right));
}

//depth of a tree
function depth(root, target , level = 0){
    if(root === null) return -1;
    if(root.val === target) return level;

    let left = depth(root.left, target, level + 1);
    if(left !== -1) return left;

    return depth(root.right, target, level + 1);

}

// Invert tree
function invertTree(root){
    if(root === null) return null;

    //swap
    let temp = root.left
    root.left = root.right
    root.right = temp

    invertTree(root.left);
    invertTree(root.right);

    return root;
}

/* 
                    1
                   / \
                  2   3
                 / \
                4   5
                  
                */

let root = new TreeNode(1);
root.left = new TreeNode(2);                                                     
root.right = new TreeNode(3);
root.left.left = new TreeNode(4);
root.left.right = new TreeNode(5);

let target = 5

console.log("Preorder: "+preOrder(root));
console.log("Inorder: " + inOrder(root));
console.log("Postorder: " + postOrder(root));
console.log("Height: " + height(root));
console.log("Depth of tree: " + depth(root, target));
// console.log("Invert tree: " + invertTree(root));
console.log(invertTree(root))

