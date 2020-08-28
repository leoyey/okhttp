package okhttp3;

import javax.annotation.Nullable;
import java.net.InetSocketAddress;
import java.net.Proxy;
import java.net.Socket;

public interface LocalAddressProvider {
    @Nullable
    LocalAddress getLocalAddress(Call call, InetSocketAddress inetSocketAddress,
                                 Proxy proxy, Socket socket);
}
