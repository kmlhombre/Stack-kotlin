import java.lang.Exception

fun main() {
    val stack = Stack(5)

    try {
        stack.top()
    }
    catch (e: Exception) {
        println(e.message)
    }

    try {
        stack.addOnStack(1)
    }
    catch (e: Exception) {
        println(e.message)
    }
    finally {
        stack.top()
    }

    try {
        stack.addOnStack(2)
    }
    catch (e: Exception) {
        println(e.message)
    }
    finally {
        stack.top()
    }

    try {
        stack.addOnStack(3)
    }
    catch (e: Exception) {
        println(e.message)
    }
    finally {
        stack.top()
    }

    try {
        stack.addOnStack(4)
    }
    catch (e: Exception) {
        println(e.message)
    }
    finally {
        stack.top()
    }

    try {
        stack.addOnStack(5)
    }
    catch (e: Exception) {
        println(e.message)
    }
    finally {
        stack.top()
    }

    try {
        stack.addOnStack(6)
    }
    catch (e: Exception) {
        println(e.message)
    }
    finally {
        stack.top()
    }

    try {
        stack.deleteFromStack()
    }
    catch (e: Exception) {
        println(e.message)
    }
    finally {
        stack.top()
    }

    try {
        stack.deleteFromStack()
    }
    catch (e: Exception) {
        println(e.message)
    }
    finally {
        stack.top()
    }
}