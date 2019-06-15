import java.lang.Exception

class Stack constructor(_size: Int) {
    val _stack = arrayListOf<Int>()
    val _size_stack = _size

    fun addOnStack(value: Int) {
        if(_stack.size < _size_stack) {
            _stack.add(value)
        }
        else {
            throw Exception("Stack is full!")
        }
    }

    fun deleteFromStack() {
        if(_stack.size != 0) {
            _stack.remove(_stack.get(_stack.size - 1))
        }
        else {
            throw Exception("Stack is empty!")
        }
    }

    fun top() {
        if(_stack.size != 0) {
            println("Top element of stack is: " + _stack.get(_stack.size - 1))
        }
        else {
            throw Exception("Stack is empty!")
        }
    }
}