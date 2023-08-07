package pl.kukla.krzys.designpatterns._2_structural._12_adapter.connection_interface;

import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
class HdmiAdapter implements Connection {
    private final Hdmi hdmi;

    @Override
    public void connect() {
        hdmi.join();
    }
}
