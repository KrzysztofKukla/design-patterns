package pl.kukla.krzys.designpatterns._2_structural._12_adapter.connection_interface;

import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
class ConnectionClient {
    private final Connection connection;

    void connect() {
        connection.connect();
    }

}
