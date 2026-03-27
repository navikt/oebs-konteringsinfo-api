package no.nav.oebs.okonomimodell.api.segmenter.v1;

/**
 * Valid segment types in the økonomimodell from Oracle EBS.
 *
 * The Jira requires validation against all 12 segments. The two free
 * segments and any remaining ones will be added once the Oracle view
 * structure is confirmed with the team.
 */
public enum Segment {
    ARTSKONTO,
    KOSTNADSSTED,
    PRODUKT,
    OPPGAVE,
    STATSREGNSKAPSKONTO,
    FELLES
}
