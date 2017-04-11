package com.mauro.ejerprogavanzada;

class LinkList2<E,K> {

    private Link2 first;

    public LinkList2() {
        first = null;
    }

    public void insertFirst(E id,K sec) {
        Link2<E,K> newLink = new Link2(id,sec);
        newLink.next = first;
        first = newLink;
    }

    public Link2 find(E key,K sec) {
        Link2<E,K> current = first;
        while (current.iData != key) {
            if (current.next == null) {
                return null;
            } else {
                current = current.next;
            }
        }
        return current;
    }

    public Link2 delete(E key,K sec) {
        Link2<E,K> current = first;
        Link2<E,K> previous = first;
        while (current.iData != key) {
            if (current.next == null) {
                return null;
            } else {
                previous = current;
                current = current.next;
            }
        }
        if (current == first) {
            first = first.next;
        } else {
            previous.next = current.next;
        }
        return current;
    }

    public void displayList() {
        System.out.print("List (first-->last): ");
        Link2 current = first;
        while (current != null) {
            current.displayLink();
            current = current.next;
        }
        System.out.println("");
    }
}
