package jenkins.slaves.systemInfo;

import hudson.Extension;

/**
 * @author Kohsuke Kawaguchi
 */
@Extension
public class ThreadDumpSlaveInfo extends SlaveSystemInfo {
    @Override
    public String getDisplayName() {
        return Messages.ThreadDumpSlaveInfo_DisplayName();
    }
}
