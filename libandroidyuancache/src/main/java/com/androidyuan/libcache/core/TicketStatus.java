package com.androidyuan.libcache.core;

public final class TicketStatus {

    public static final int CACHE_STATUS_ON_CACHING = 0;//When data is moving to disk you has to set status to CACHE_STATUS_ON_CACHING.
    public static final int CACHE_STATUS_ON_NATIVE = 1;
    public static final int CACHE_STATUS_ONDISK = 2;
    public static final int CACHE_STATUS_IS_RESUMED = 3;
    public static final int CACHE_STATUS_WAS_LOST = -1;

}
