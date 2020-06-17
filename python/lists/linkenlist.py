"""
Til oppgave implementer følgene metoder:
    - find
    - remove_first
    - remove_last
"""


class LinkedList:
    def __init__(self, head=None):
        self.head = head
        self.size = 0

    def get_size(self):
        return self.size

    def add(self, value):
        new_node = self.Node(value, self.head)
        self.head = new_node
        self.size += 1

    def get_value(self):
        return self.head.value

    class Node:
        def __init__(self, value, next=None):
            self.value = value
            self.next = next


myLinkedList = LinkedList()
myLinkedList.add('Byamungu')
myLinkedList.add('Kabiraba')
myLinkedList.add('Feze')
print(myLinkedList.get_value())
