package org.AP;

class Comments {
    private String text;
    private String username;

    public void comment(String text, String username) {
        this.text = text;
        this.username = username;
    }
    public void edit(String text, String newText, String username) {
        text = newText;
    }
}