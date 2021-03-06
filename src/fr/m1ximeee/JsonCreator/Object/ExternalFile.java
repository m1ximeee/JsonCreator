package fr.m1ximeee.JsonCreator.Object;

public class ExternalFile
{
    private final String path;
    private final String downloadURL;
    private final String sha1;
    private final long size;
    private final boolean update;

    public ExternalFile(String path, String downloadURL, String sha1, long size, boolean update)
    {
        this.path = path;
        this.downloadURL = downloadURL;
        this.sha1 = sha1;
        this.size = size;
        this.update = update;
    }

    public ExternalFile(String path, String downloadURL, String sha1, long size)
    {
        this.path = path;
        this.downloadURL = downloadURL;
        this.sha1 = sha1;
        this.size = size;
        this.update = true;
    }

    public String getPath()
    {
        return this.path;
    }

    public String getDownloadURL()
    {
        return this.downloadURL;
    }

    public String getSha1()
    {
        return this.sha1;
    }

    public long getSize()
    {
        return this.size;
    }

    public boolean isUpdate()
    {
        return this.update;
    }
}

