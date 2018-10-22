
import org.zeromq.ZContext
import org.zeromq.ZMQ

/**
 * TBD
 *
 * @version $version-stub$
 * @since   FIXME
 */

const val PULL_PORT = 5557
const val BIND_ADDR = "tcp://127.0.0.1:$PULL_PORT"

fun main(args: Array<String>) {
    println("Pulling from $BIND_ADDR")
    ZContext().use { context ->
        // Socket to talk to clients
        val socket = context.createSocket(ZMQ.PULL)
        socket.connect(BIND_ADDR)

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
