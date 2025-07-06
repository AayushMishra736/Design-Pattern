package Structural;

import java.util.HashMap;
import java.util.Map;

interface Icon {
    void draw(int x, int y);
}

class FileIcon implements Icon {
    private String type;
    private String imageName;

    public FileIcon(String type, String imageName) {
        this.type = type;
        this.imageName = imageName;
    }

    @Override
    public void draw(int x, int y) {
        System.out.println("Drawing " + type + " icon with image " + imageName + " at position (" + x + ", " + y + ")");
    }
}

class FolderIcon implements Icon {
    private String color;
    private String imageName;

    public FolderIcon(String color, String imageName) {
        this.color = color;
        this.imageName = imageName;
    }

    @Override
    public void draw(int x, int y) {
        System.out.println("Drawing folder icon with color " + color + " and image " + imageName + " at position (" + x + ", " + y + ")");
    }
}

class IconFactory {
    private Map<String, Icon> iconCache = new HashMap<>();

    public Icon getIcon(String key) {
        if (iconCache.containsKey(key)) {
            return iconCache.get(key);
        } else {
            Icon icon;
            if (key.equals("file")) {
                icon = new FileIcon("document", "document.png");
            } else if (key.equals("folder")) {
                icon = new FolderIcon("blue", "folder.png");
            } else {
                throw new IllegalArgumentException("Unsupported icon type: " + key);
            }
            iconCache.put(key, icon);
            return icon;
        }
    }
}

/*
    The Flyweight design pattern is a structural pattern that optimizes memory usage by sharing a common state among multiple objects.
        It aims to reduce the number of objects created and to decrease memory footprint, which is particularly useful when dealing with a large number of similar objects.*/
public class FlyweightDesignPattern {
    public static void main(String[] args) {
        IconFactory iconFactory = new IconFactory();

        // Draw file icons at different positions
        Icon fileIcon1 = iconFactory.getIcon("file");
        fileIcon1.draw(100, 100);

        Icon fileIcon2 = iconFactory.getIcon("file");
        fileIcon2.draw(150, 150);

        // Draw folder icons at different positions
        Icon folderIcon1 = iconFactory.getIcon("folder");
        folderIcon1.draw(200, 200);

        Icon folderIcon2 = iconFactory.getIcon("folder");
        folderIcon2.draw(250, 250);
    }
}
