"""
Breadth First Search (BFS) - on undirected graph
- is a graph traversal algorithm
* It finds every vertex tht is reachable from the source and finds its
  distance form the source
* It woks on directed and undirected graphs
* Runs in O(V + E) time (Vertex/Edges)

"""


class Vertex:
    def __init__(self, name):
        self.name = name
        self.neighbors = list()
        self.distance = 9999
        self.visited = False

    def add_neighbor(self, v):
        if v not in self.neighbors:
            self.neighbors.append(v)
            self.neighbors.sort()


class Graph:
    vertices = {}

    def add_vertex(self, vertex):
        if vertex.name not in self.vertices:
            self.vertices[vertex.name] = vertex
            return True
        else:
            return False

    def add_edge(self, u, v):
        if u in self.vertices and v in self.vertices:
            for key, value in self.vertices.items():
                if key == u:
                    value.add_neighbor(v)
                if key == v:
                    value.add_neighbor(u)
            return True
        else:
            return False

    def print_graph(self):
        for key in sorted(list(self.vertices.keys())):
            print(key + str(self.vertices[key].neighbors) + ' ' + str(self.vertices[key].distance))

    def btf(self, vertex):
        queue = list()
        vertex.distance = 0
        vertex.visited = True
        for v in vertex.neighbors:
            self.vertices[v].distance = vertex.distance + 1
            queue.append(v)

        while len(queue) > 0:
            u = queue.pop()
            node_u = self.vertices[u]
            node_u.visited = True

            for v in node_u.neighbors:
                node_v = self.vertices[v]
                if not node_v.visited:
                    queue.append(v)
                    if node_v.distance > node_u.distance + 1:
                        node_v.distance = node_u.distance + 1


g = Graph()
a = Vertex('A')
g.add_vertex(a)

for n in range(ord('A'), ord('F')):
    g.add_vertex(Vertex(chr(n)))

edgers = ['CB', 'AB', 'AC', 'BA', 'CA', 'BE', 'BD', 'CD', 'DB', 'DE', 'EB', 'ED']
for ege in edgers:
    g.add_edge(ege[:1], ege[1:])


print(f'Distance from {a.name}')
g.btf(a)
g.print_graph()
