package okhttp3;

import javax.annotation.Nullable;
import java.net.SocketAddress;

public interface LocalAddress {
    @Nullable
    SocketAddress getAddress();
    boolean isHealth();
}
