
import org.zeromq.ZContext
import org.zeromq.ZMQ

/**
 * TBD
 *
 * @version $version-stub$
 * @since   FIXME
 */

fun main() {
    ZContext().use { context ->
        // Socket to talk to clients
        val socket = context.createSocket(ZMQ.REP)
        socket.bind("tcp://*:5555")

        while (!Thread.currentThread().isInterrupted) {
            // Block until a message is received
            val reply = socket.recv(0)

            // Print the message
            println("Received: [" + String(reply, ZMQ.CHARSET) + "]")

            // Send a response
            val response = "Hello, world!"
            socket.send(response.toByteArray(ZMQ.CHARSET), 0)
        }
    }

}
