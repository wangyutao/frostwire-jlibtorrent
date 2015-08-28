/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 3.0.7
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package com.frostwire.jlibtorrent.swig;

public class file {
  private transient long swigCPtr;
  protected transient boolean swigCMemOwn;

  protected file(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(file obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        libtorrent_jni.delete_file(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public file() {
    this(libtorrent_jni.new_file__SWIG_0(), true);
  }

  public file(String p, int m, error_code ec) {
    this(libtorrent_jni.new_file__SWIG_1(p, m, error_code.getCPtr(ec), ec), true);
  }

  public boolean open(String p, int m, error_code ec) {
    return libtorrent_jni.file_open(swigCPtr, this, p, m, error_code.getCPtr(ec), ec);
  }

  public boolean is_open() {
    return libtorrent_jni.file_is_open(swigCPtr, this);
  }

  public void close() {
    libtorrent_jni.file_close(swigCPtr, this);
  }

  public boolean set_size(long size, error_code ec) {
    return libtorrent_jni.file_set_size(swigCPtr, this, size, error_code.getCPtr(ec), ec);
  }

  public int open_mode() {
    return libtorrent_jni.file_open_mode(swigCPtr, this);
  }

  public long get_size(error_code ec) {
    return libtorrent_jni.file_get_size(swigCPtr, this, error_code.getCPtr(ec), ec);
  }

  public long sparse_end(long start) {
    return libtorrent_jni.file_sparse_end(swigCPtr, this, start);
  }

  public int native_handle() {
    return libtorrent_jni.file_native_handle(swigCPtr, this);
  }

  public long file_id() {
    return libtorrent_jni.file_file_id(swigCPtr, this);
  }

  public enum open_mode_t {
    read_only(libtorrent_jni.file_read_only_get()),
    write_only(libtorrent_jni.file_write_only_get()),
    read_write(libtorrent_jni.file_read_write_get()),
    rw_mask(libtorrent_jni.file_rw_mask_get()),
    sparse(libtorrent_jni.file_sparse_get()),
    no_atime(libtorrent_jni.file_no_atime_get()),
    random_access(libtorrent_jni.file_random_access_get()),
    lock_file(libtorrent_jni.file_lock_file_get()),
    no_cache(libtorrent_jni.file_no_cache_get()),
    direct_io(libtorrent_jni.file_direct_io_get()),
    coalesce_buffers(libtorrent_jni.file_coalesce_buffers_get()),
    attribute_hidden(libtorrent_jni.file_attribute_hidden_get()),
    attribute_executable(libtorrent_jni.file_attribute_executable_get()),
    attribute_mask(libtorrent_jni.file_attribute_mask_get());

    public final int swigValue() {
      return swigValue;
    }

    public static open_mode_t swigToEnum(int swigValue) {
      open_mode_t[] swigValues = open_mode_t.class.getEnumConstants();
      if (swigValue < swigValues.length && swigValue >= 0 && swigValues[swigValue].swigValue == swigValue)
        return swigValues[swigValue];
      for (open_mode_t swigEnum : swigValues)
        if (swigEnum.swigValue == swigValue)
          return swigEnum;
      throw new IllegalArgumentException("No enum " + open_mode_t.class + " with value " + swigValue);
    }

    @SuppressWarnings("unused")
    private open_mode_t() {
      this.swigValue = SwigNext.next++;
    }

    @SuppressWarnings("unused")
    private open_mode_t(int swigValue) {
      this.swigValue = swigValue;
      SwigNext.next = swigValue+1;
    }

    @SuppressWarnings("unused")
    private open_mode_t(open_mode_t swigEnum) {
      this.swigValue = swigEnum.swigValue;
      SwigNext.next = this.swigValue+1;
    }

    private final int swigValue;

    private static class SwigNext {
      private static int next = 0;
    }
  }

}
