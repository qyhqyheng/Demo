package justec.qin.demo;

import android.os.Parcel;
import android.os.Parcelable;

public class Book implements Parcelable {
    private int mData;
    private String mName;
    protected Book(Parcel in) {
        mData = in.readInt();
        mName = in.readString();
    }

    public static final Creator<Book> CREATOR = new Creator<Book>() {
        @Override
        public Book createFromParcel(Parcel in) {
            return new Book(in);
        }

        @Override
        public Book[] newArray(int size) {
            return new Book[size];
        }
    };

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeInt(mData);
        dest.writeString(mName);
    }
}
