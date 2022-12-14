

class Stack { 
  
    // Array is used to implement stack 
    constructor() 
    { 
        this.items = []; 
        console.log("THis is example");
    } 
  
    // Functions to be implemented 
    // push(item) 
    // pop() 
    // peek() 
    // isEmpty() 
    // printStack() 

    // push function 
push(element) 
{ 
	// push element into the items 
	this.items.push(element); 
} 

// pop function 
pop() 
{ 
	// return top most element in the stack 
	// and removes it from the stack 
	// Underflow if stack is empty 
	if (this.items.length == 0) 
		return "Underflow"; 
	return this.items.pop; 
} 

// peek function 
peek() 
{ 
    // return the top most element from the stack 
    // but does'nt delete it. 
    return this.items[this.items.length - 1]; 
} 

// isEmpty function 
isEmpty() 
{ 
	// return true if stack is empty 
	return this.items.length == 0; 
} 

printStack() 
{ 
    var str = ""; 
    for (var i = 0; i < this.items.length; i++) 
        str += this.items[i] + " "; 
    return str; 
} 



    
} 
var stack = new Stack(); 
// Adding element to the stack 
stack.push(10); 
stack.push(20); 
stack.push(30); 
  
// Printing the stack element 
// prints [10, 20, 30] 
console.log(stack.printStack()); 
  
// returns 30 
console.log(stack.peek()); 
  
// returns 30 and remove it from stack 
console.log(stack.pop()); 
  
// returns [10, 20] 
console.log(stack.printStack());  

function postFixEvaluation(exp) 
{ 
    var stack = new Stack(); 
    for (var i = 0; i < exp.length; i++) { 
        var c = exp[i]; 
        if (!isNaN(c)) 
            stack.push(c - '0'); 
        else { 
            var val1 = stack.pop(); 
            var val2 = stack.pop(); 
            if (val1 == "Underflow" || val2 == "Underflow") 
                return "Can't perform postfix evaluation"; 
            switch (c) { 
            case '+': 
                stack.push(val2 + val1); 
                break; 
  
            case '-': 
                stack.push(val2 - val1); 
                break; 
  
            case '/': 
                stack.push(val2 / val1); 
                break; 
  
            case '*': 
                stack.push(val2 * val1); 
                break; 
            } 
        } 
    } 
  
    return stack.pop(); 
} 
  
// calling the above method 
// returns 9 
console.log(postFixEvaluation("235*+8-"));  
  
// returns postfix evaluation can't be performed 
console.log(postFixEvaluation("23*+")); 

