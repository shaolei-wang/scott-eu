import time
import zmq

BIND_ADDR = "tcp://127.0.0.1:5557"

def producer():
    context = zmq.Context()
    zmq_socket = context.socket(zmq.PUSH)
    zmq_socket.bind(BIND_ADDR)
    # Start your result manager and workers before you start your producers
    for num in range(20000):
        work_message = { 'num' : num }
        zmq_socket.send_json(work_message)
        print("Sent message: " + work_message)

if __name__ == '__main__':
    print("Pushing to " + BIND_ADDR)
    producer()
