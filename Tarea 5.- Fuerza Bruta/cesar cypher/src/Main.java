public class Main {
    public static void main(String[] args) {
        String[] message = "l.ziu,mf .fzmk,wzilwgfqw mfai kwukmsw flw,wfifsif.upamz plilflmf .fik,.isfm k.lwfmufmsfk.isfmsfiñ.psiftmcpkiuifdfmsfkwulwzfiulpuwgfk.isfiamfjpkmnisigfxzw,mñmufmsflm xspmñ.mflmsftixiflmfitmzpkifsi,puigflm lmfsifnzwu,mzifuwz,mflmftmcpkwfoi ,ifmsfkijwflmfowzuw gfxsi tiulwfsif.upnpkikpwuflmfsw fpjmzwitmzpkiuw gfu.m ,zwfkwu,pumu,mfu.mawfdfiu,pñ.wgfxzmlm ,puilwfifkwu,mumzf.uifzieify.pu,igfsifzieifkw tpkigfmufsifk.isf mfn.ulpziufsi flp xmz i fdf mfkwu .tizifsif.uplilh".split("");
        String[] alphabet = "abcdefghijklmnñopqrstuvwxyz ,.".split("");

        int alphLen = alphabet.length;
        int msgLen = message.length;
        shift(message,alphabet,msgLen,alphLen);
    }

    public static int id(String message, String[] alphabet, int a){
        for (int i = 0; i < a; i++) {
            String comp = alphabet[i];
            if (message.equals(alphabet[i])){
                return i;
            }

        }
        return 0;
    }

    public static void shift(String[] msg,String[] alph, int msgLen, int alphLeng){
        for (int i = 0; i < alphLeng; i++) {
            for (int j = 0; j < msgLen; j++) {
                if (id(msg[j], alph, alphLeng) + i > alphLeng - 1) {
                    System.out.print(alph[id(msg[j], alph, alphLeng) + i - alphLeng]);
                } else {
                    System.out.print(alph[id(msg[j], alph, alphLeng) + i]);
                }
            }
            System.out.println("\n");
        }
    }
}
