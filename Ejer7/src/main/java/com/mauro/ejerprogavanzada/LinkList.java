package com.mauro.ejerprogavanzada;

class LinkList<E> {

    private Link first;

    public LinkList() {
        first = null;
    }

    public void insertFirst(E id) {
        Link<E> newLink = new Link(id);
        newLink.next = first;
        first = newLink;
    }

    public Link find(E key) {
        Link<E> current = first;
        while (current.iData != key) {
            if (current.next == null) {
                return null;
            } else {
                current = current.next;
            }
        }
        return current;
    }

    public Link delete(E key) {
        Link<E> current = first;
        Link<E> previous = first;
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
        Link current = first;
        while (current != null) {
            current.displayLink();
            current = current.next;
        }
        System.out.println("");
    }
}