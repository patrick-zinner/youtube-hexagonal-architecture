-- init-schema.sql
DO $$
    BEGIN
        IF NOT EXISTS (SELECT schema_name
                       FROM information_schema.schemata
                       WHERE schema_name = 'hexagon') THEN
            CREATE SCHEMA hexagon;
        END IF;
    END
$$;