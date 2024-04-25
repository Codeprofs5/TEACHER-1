#bfs
from operator import truediv
from queue import Queue
import queue
nodes={'A':['B','C'],'B':['D','E'],'C':['F','G'],'D':['B','E'],'E':['B','D'],'F':['C'],'G':['C']}
q=Queue()
visited={}
parent={}
level={}
visited_display=[]
print(nodes)
for node in nodes:
    visited[node]=False
    parent[node]=None
    level[node]=-1
S='A'
visited[S]=True
level[S]=0
q.put(S)
while not q.empty():
   u=q.get(S)
   visited_display.append(u)
   for adjacent in nodes[u]:
       visited[adjacent]=True
       parent[adjacent]=u
       level[adjacent]=level[u]+1
       q.put(adjacent)

       

       
   
   
    