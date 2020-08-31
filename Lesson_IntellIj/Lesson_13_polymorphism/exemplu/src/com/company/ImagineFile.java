package com.company;

public class ImagineFile extends File {
    protected int width;
    protected int height;
    protected byte[] content;

    ImagineFile(String fullName, int width, int height, byte[] content) {
        super(fullName);
        this.width = width;
        this.height = height;
        this.content = content;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public void setContent(byte[] content) {
        this.content = content;
    }

    public int getWidth() {
        return width;
    }

    public int getHeight() {
        return height;
    }

    public byte[] getContent() {
        return content;
    }
@Override
    public String getFileInfo() {
        return String.format("Imagine: %s, width: %d, height: %d", fullName, width, height);
    }
}
